#include "doctor_data.h"
heaven::Vessel::Vessel(std::string nam, int gen, star_map::System sys) {
  this->name = nam;
  this->generation = gen;
  this->current_system = sys;
}
heaven::Vessel heaven::Vessel::replicate(std::string str) {
  return Vessel(str, this->generation + 1, this->current_system);
}
bool heaven::Vessel::shoot_buster() {
  if (busters > 0) {
    --busters;
    return true;
  }
  return false;
}
void heaven::Vessel::make_buster() { ++busters; }
std::string heaven::get_older_bob(heaven::Vessel v1, heaven::Vessel v2){
  return (v1.generation <= v2.generation) ? v1.name : v2.name;
}
bool heaven::in_the_same_system(heaven::Vessel v1, heaven::Vessel v2){
  return v1.current_system == v2.current_system;
}

