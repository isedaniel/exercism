#include "lasagna_master.h"

#include <string>
#include <vector>

namespace Consts {
int noodles{50};
double sauce{.2};
}  // namespace Consts

namespace lasagna_master {
int preparationTime(std::vector<std::string> layers, int time) {
  return layers.size() * time;
}

amount quantities(std::vector<std::string> layers) {
  int noodles{};
  int sauce{};
  for (int i{}, size = layers.size(); i < size; ++i) {
    if (layers.at(i) == "noodles") ++noodles;
    if (layers.at(i) == "sauce") ++sauce;
  }

  return amount{noodles * Consts::noodles, sauce * Consts::sauce};
}

void addSecretIngredient(std::vector<std::string>& myList,
                         const std::vector<std::string>& friendsList) {
  myList.pop_back();
  myList.push_back(friendsList.at(friendsList.size() - 1));
}

void addSecretIngredient(std::vector<std::string>& myList,
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
