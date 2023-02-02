package co.com.chartsofka.music.dto;

import co.com.chartsofka.music.entity.Album;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ArtistDTO {
    private String artistID;
    private String name;
    private String country;
    private LocalDate debutDate;
    private String enterprise;
    private String type;
    private List<Album> albums = new ArrayList<>();
}
