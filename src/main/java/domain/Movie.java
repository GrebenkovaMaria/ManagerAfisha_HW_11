package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
    private int id;
    private String imageUrl;
    private String movieName;
    private String genre;
    private boolean premierTomorrow;
}

