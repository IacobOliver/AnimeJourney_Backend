package AnimeJourney.anime.controller;

import AnimeJourney.anime.model.AnimeReview;
import AnimeJourney.anime.model.FetchResponse;
import AnimeJourney.anime.service.AnimeReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reviews")
public class AnimeReviewController {
    private final AnimeReviewService animeReviewService;

    @Autowired
    public AnimeReviewController(AnimeReviewService animeReviewService) {
        this.animeReviewService = animeReviewService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<AnimeReview>> getAnimeReviews(@RequestParam (name = "animeId") long animeId){
        return ResponseEntity.ok(animeReviewService.getAnimeReviews(animeId));
    }

    @PostMapping()
    public ResponseEntity<AnimeReview> postAnimeReview(@RequestBody AnimeReview animeReview){
        System.out.println(animeReview.toString());
        return ResponseEntity.ok(animeReviewService.postAnimeReview(animeReview));
    }

    @DeleteMapping()
    public ResponseEntity<FetchResponse> deleteAnimeReview(@RequestParam (name = "reviewId") long reviewId){
        return ResponseEntity.ok(animeReviewService.deleteReview(reviewId));
    }

    @PatchMapping()
        public ResponseEntity<AnimeReview> updateReview(@RequestParam (name = "reviewId") long reviewId,
                                                        @RequestParam (name = "contentReview") String contentReview,
                                                        @RequestParam (name = "currentDate") String currentDate){
           return ResponseEntity.ok(animeReviewService.updateReview(reviewId ,contentReview, currentDate));
        }
    }

