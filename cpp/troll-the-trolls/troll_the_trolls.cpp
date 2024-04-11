namespace hellmath {

enum class AccountStatus {
  troll,
  guest,
  user,
  mod,
};

enum class Action {
  read,
  write,
  remove,
};

bool display_post(AccountStatus poster, AccountStatus viewer) {
  if (poster == AccountStatus::troll) return viewer == AccountStatus::troll;
  return true;
}

bool permission_check(Action action, AccountStatus status) {
  switch (status) {
    case AccountStatus::troll:
    case AccountStatus::user:
      return action <= Action::write;
    case AccountStatus::mod:
      return action <= Action::remove;
    default:
      return action == Action::read;
  }
}

bool valid_player_combination(AccountStatus player1, AccountStatus player2) {
  if (player1 == AccountStatus::guest || player2 == AccountStatus::guest)
    return false;
  if (player1 == AccountStatus::troll || player2 == AccountStatus::troll)
    return (player1 == AccountStatus::troll && player2 == AccountStatus::troll);
  return true;
}

bool has_priority(AccountStatus s1, AccountStatus s2) { return s1 > s2; }

}  // namespace hellmath
