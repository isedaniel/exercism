#include "lasagna_master.h"

#include <string>
#include <vector>

namespace Consts {
int noodles{50};
double sauce{.2};
}  // namespace Consts

namespace lasagna_master {
using ingredients = std::vector<std::string>;

int preparationTime(const ingredients& layers, int time) {
  return layers.size() * time;
}

amount quantities(const ingredients& layers) {
  int noodles{};
  double sauce{};
  for (auto &layer: layers){
    if (layer == "noodles") noodles += Consts::noodles;
    else if (layer == "sauce") sauce += Consts::sauce;
  }

  return amount{noodles, sauce};
}

void addSecretIngredient(ingredients& myList,
                         const ingredients& friendsList) {
  myList.pop_back();
  myList.push_back(friendsList.at(friendsList.size() - 1));
}

void addSecretIngredient(ingredients& myList,
                         const std::string& secretIngredient) {
  myList.pop_back();
  myList.push_back(secretIngredient);
}

std::vector<double> scaleRecipe(const std::vector<double>& quantities,
                                int scale) {
  std::vector<double> scaled{};
  for (int i{}, size = quantities.size(); i < size; ++i) {
    scaled.push_back(quantities.at(i) * scale / 2.0);
  }
  return scaled;
}

}  // namespace lasagna_master
