package Publisher_Subscriber;

public enum CategoriesOfPosts {
    POSTS   ("post"),
    VIDEO  ("video"),
    STREAM   ("stream"),
    SPONSORS ("sponsors");

    public final String value;

    CategoriesOfPosts(String value) {
        this.value = value;
    }
}
