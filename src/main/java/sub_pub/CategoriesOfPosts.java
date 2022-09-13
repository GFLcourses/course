package sub_pub;

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
