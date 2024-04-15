#pragma once
#include <string>
#include <vector>

using ingredients = std::vector<std::string>;

namespace lasagna_master {

struct amount {
  int noodles;
  double sauce;
};

using ingredients = std::vector<std::string>;
int preparationTime(const ingredients& layers, int time = 2);
amount quantities(const ingredients& layers);
void addSecretIngredient(ingredients& myList,
                         const ingredients& friendsList);
void addSecretIngredient(ingredients& myList,
                         const std::string& secretIngredient);
std::vector<double> scaleRecipe(const std::vector<double>& quantities,
                                int scale);

}  // namespace lasagna_master
