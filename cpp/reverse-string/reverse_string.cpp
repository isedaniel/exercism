#include "reverse_string.h"

namespace reverse_string {
std::string reverse_string(std::string_view s){
    return {s.rbegin(), s.rend()};
}
}  // namespace reverse_string
