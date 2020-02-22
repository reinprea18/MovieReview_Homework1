package at.fh.swengb.reinprecht

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_review.*

class ReviewActivity : AppCompatActivity() {
    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA";
        val ADD_OR_EDITED_RESULT = "ADD_RESULT";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_review)

        val movieId = intent.getStringExtra("PassedID")

        if (movieId == null) {
            Toast.makeText(this, "No movieID given", Toast.LENGTH_SHORT).show()
            finish()
        } else {
            val movieName = MovieRepository.movieById(movieId)?.title
            movie_rating_header.text = movieName

            rate_movie.setOnClickListener{
                val ratingValue = movie_rating_bar.rating.toDouble()
                val feedback = movie_feedback.text.toString()
                val rating = Review(ratingValue, feedback)

                MovieRepository.rateMovie(movieId,rating)

                val intentResult = intent
                intentResult.putExtra(EXTRA_MOVIE_ID ,movieId)

                setResult(Activity.RESULT_OK)
                finish()
            }


            movie_rating_bar.rating.toDouble()
            movie_feedback.text.toString()
        }

    }

}