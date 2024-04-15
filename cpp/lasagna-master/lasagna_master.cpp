#include "lasagna_master.h"

#include <string>
#include <vector>

namespace Consts {
int noodles{50};
double sauce{.2};
}

namespace lasagna_master {
int preparationTime(std::vector<std::string> layers, int time) {
  return layers.size() * time;
}

amount quantities(std::vector<std::string> layers){
  int noodles{};
  int sauce{};
  for (int i{}, size = layers.size(); i<size; ++i){
    if (layers.at(i) == "noodles") ++noodles;
    if (layers.at(i) == "sauce") ++sauce;
  }

  return amount{noodles * Consts::noodles, sauce * Consts::sauce};
}

}  // namespace lasagna_master
