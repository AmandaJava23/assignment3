import java.util.Objects;

public class NoPopFilter implements GenreFilter{
    @Override
    public boolean permit(Album a) {
        return !Objects.equals(a.genre(), "Pop");
    }
}
