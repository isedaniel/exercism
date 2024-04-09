#include "raindrops.h"
#include <string>

namespace raindrops {
    std::string convert(int i) {
    std::string sound{};
    if (i % 3 == 0)
        sound += "Pling";
    if (i % 5 == 0)
        sound += "Plang";
    if (i % 7 == 0)
        sound += "Plong";

    if (sound.empty())
        return std::to_string(i);
    return sound;
    }

}  // namespace raindrops
