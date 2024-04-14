#include <string>

namespace star_map {
enum class System {
  AlphaCentauri,
  BetaHydri,
  DeltaEridani,
  EpsilonEridani,
  Omicron2Eridani,
  Sol,
};
}

namespace heaven {
class Vessel {
 public:
  Vessel(std::string name, int generation,
         star_map::System current_system = star_map::System::Sol);
  heaven::Vessel replicate(std::string str);
  void make_buster();
  bool shoot_buster();

  std::string name{};
  int generation{};
  star_map::System current_system{};
  int busters{0};
};

std::string get_older_bob(const Vessel& v1, const Vessel& v2);
bool in_the_same_system(const Vessel& v1, const Vessel& v2);
}  // namespace heaven
