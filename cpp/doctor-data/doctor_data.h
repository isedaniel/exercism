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
  Vessel(std::string nam, int gen,
         star_map::System sys = star_map::System::Sol);
  heaven::Vessel replicate(std::string str);
  void make_buster();
  bool shoot_buster();

  std::string name{};
  int generation{};
  star_map::System current_system{};
  int busters{0};
};
std::string get_older_bob(heaven::Vessel v1, heaven::Vessel v2);
bool in_the_same_system(heaven::Vessel v1, heaven::Vessel v2);

}  // namespace heaven
