public interface Selection {
    /** selects from the given population the parents of the next generation **/
    void naturalSelect(String solution, Population p);
}
