package co.com.chartsofka.music.service;


import co.com.chartsofka.music.dto.SongDTO;
import co.com.chartsofka.music.entity.Song;

import java.util.List;

public interface ISongService {
    Song dtoToEntity (SongDTO songDTO);
    SongDTO entityToDTO(Song song);
    List<SongDTO> getAllSongs();

    SongDTO findSongById(String idSong);

    SongDTO saveSong(SongDTO songDTO);

    SongDTO updateSong(SongDTO artistDTO);

    void deleteSong(String idArtist);

    List<SongDTO> getTenMostSongs();
    List<SongDTO> getAllSongOfAlbum(String idAlbum) ;
}
