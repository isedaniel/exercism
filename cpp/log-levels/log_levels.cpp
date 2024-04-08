#include <string>

namespace log_line {
    std::string message(std::string line) {
        // return the message
        auto index{line.find(": ") + 2};
        return line.substr(index);
    }

    std::string log_level(std::string line) {
        // return the log level
        auto start{line.find("[")+1};
        auto end{line.find("]")-1};
        return line.substr(start, end);
    }

    std::string reformat(std::string line) {
        return message(line) + " (" + log_level(line) + ")";
    }
}
