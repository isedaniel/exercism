#include <string>
#include <vector>

namespace election {

// The election result struct is already created for you:

struct ElectionResult {
    // Name of the candidate
    std::string name{};
    // Number of votes the candidate has
    int votes{};
};

// vote_count takes a reference to an `ElectionResult` as an argument and will
// return the number of votes in the `ElectionResult.
int vote_count(const ElectionResult& e){
    return e.votes;
}

// increment_vote_count takes a reference to an `ElectionResult` as an argument
// and a number of votes (int), and will increment the `ElectionResult` by that
// number of votes.
void increment_vote_count(ElectionResult& e, int votes) {
    e.votes += votes;
}

// determine_result receives the reference to a final_count and returns a
// reference to the `ElectionResult` of the new president. It also changes the
// name of the winner by prefixing it with "President". The final count is given
// in the form of a `reference` to `std::vector<ElectionResult>`, a vector with
// `ElectionResults` of all the participating candidates.
ElectionResult& determine_result(std::vector<ElectionResult>& ve){
    int win_index{};
    int win_votes{};
    int size = ve.size();
    for (int i{0}; i<size; i++){
        if (ve.at(i).votes > win_votes){ win_index = i; win_votes = ve.at(i).votes;};
    }
    ve[win_index].name = "President " + ve[win_index].name;
    return ve[win_index];
}

}  // namespace election
