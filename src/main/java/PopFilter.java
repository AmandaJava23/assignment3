import java.util.Objects;

public class PopFilter implements GenreFilter{
    @Override
    public boolean permit(Album a) {
        return Objects.equals(a.genre(), "Pop");
    }
}
