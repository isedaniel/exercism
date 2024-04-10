namespace hellmath {

enum class AccountStatus {
  troll,
  user,
  guest,
  mod,
};

enum class Action{
  read,
  write,
  remove,
};

bool display_post(AccountStatus s1, AccountStatus s2) {
  return s1 == s2;
}

// TODO: Task 3 - Implement the `permission_check` function, that takes an
// `Action` as a first argument and an `AccountStatus` to check against. It
// should return a `bool`.

// TODO: Task 4 - Implement the `valid_player_combination` function that
// checks if two players can join the same game. The function has two parameters
// of type `AccountStatus` and returns a `bool`.

// TODO: Task 5 - Implement the `has_priority` function that takes two
// `AccountStatus` arguments and returns `true`, if and only if the first
// account has a strictly higher priority than the second.

}  // namespace hellmath
