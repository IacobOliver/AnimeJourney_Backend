package AnimeJourney.anime.controller;

import AnimeJourney.anime.model.SavedFrontAnimeDetails;
import AnimeJourney.anime.model.SavedUserAnimeDetails;
import AnimeJourney.anime.service.SavedFrontAnimeDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("savedAnimeFrontDetails")
@RequiredArgsConstructor
public class SavedFrontAnimeDetailsController {
    private final SavedFrontAnimeDetailsService savedFrontAnimeDetailsService;


    @PostMapping ("/postAnime")
    public SavedUserAnimeDetails saveAnime(@RequestBody SavedFrontAnimeDetails savedFrontAnimeDetails){
        return  savedFrontAnimeDetailsService.saveAnime(savedFrontAnimeDetails);
    }

}
