class Badge {
    public String print(Integer id, String name, String department) {
        String id_str = (id == null)? "" : "[" + id + "] - ";
        String dp_str = (department == null)? "OWNER" : department.toUpperCase();
        return  id_str + name + " - " + dp_str;
    }
}
