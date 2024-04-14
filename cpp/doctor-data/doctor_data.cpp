#include "doctor_data.h"
namespace heaven {
Vessel::Vessel(std::string name, int generation, star_map::System system) {
  this->name = name;
  this->generation = generation;
  this->current_system = system;
}

Vessel Vessel::replicate(std::string str) {
  return Vessel(str, this->generation + 1, this->current_system);
}

bool Vessel::shoot_buster() {
  if (busters > 0) {
    --busters;
    return true;
  }
  return false;
}

void Vessel::make_buster() { ++busters; }

std::string get_older_bob(const Vessel& v1, const Vessel& v2) {
  return (v1.generation <= v2.generation) ? v1.name : v2.name;
}
bool in_the_same_system(const Vessel& v1, const Vessel& v2) {
  return v1.current_system == v2.current_system;
}
}  // namespace heaven
