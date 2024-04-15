#pragma once
#include <string>
#include <vector>

namespace lasagna_master {

struct amount {
  int noodles;
  double sauce;
};

int preparationTime(std::vector<std::string> layers, int time = 2);
amount quantities(std::vector<std::string> layers);

}  // namespace lasagna_master


