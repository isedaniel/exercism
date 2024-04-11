#include <array>
#include <string>
#include <vector>

// Round down all provided student scores.
std::vector<int> round_down_scores(std::vector<double> scores) {
    std::vector<int> rounded{};

    int size = scores.size();
    for (int i{}; i < size; ++i){
        rounded.emplace_back(static_cast<int>(scores.at(i)));
    }
    return rounded;
}


// Count the number of failing students out of the group provided.
int count_failed_students(std::vector<int> scores) {
    int failed{};

    int size = scores.size();
    for (int i{}; i< size; ++i){
        if (scores.at(i) <= 40) ++failed;
    }

    return failed;
}

// Determine how many of the provided student scores were 'the best' based on the provided threshold.
std::vector<int> above_threshold(std::vector<int> scores, int threshold) {
    std::vector<int> best{};

    int size = scores.size();
    for (int i{}; i < size; ++i){
        if (scores.at(i) >= threshold) best.emplace_back(scores.at(i));
    }

    return best;
}

// Create a list of grade thresholds based on the provided highest grade.
std::array<int, 4> letter_grades(int highest_score) {
    int bin{(highest_score - 40)/4};
    return {41, 41+bin, 41+bin*2, 41+bin*3};
}

// Organize the student's rank, name, and grade information in ascending order.
std::vector<std::string> student_ranking(std::vector<int> scores, std::vector<std::string> names) {
    std::vector<std::string> ranking{};

    int size = scores.size();
    for (int i{}; i < size; ++i){
        std::string rank{std::to_string(i+1)};
        std::string name{names.at(i)};
        std::string score{std::to_string(scores.at(i))};
        ranking.emplace_back(rank + ". " + name + ": " + score);
    }
    return ranking;
}

// Create a string that contains the name of the first student to make a perfect score on the exam.
std::string perfect_score(std::vector<int> scores, std::vector<std::string> names) {
    int size = scores.size();
    for (int i{}; i<size; ++i){
        if (scores.at(i) == 100) return names.at(i);
    }
    return "";
}
