import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_display_data.*

class DisplayDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val age = intent.getIntExtra("AGE", 0)
        val gender = intent.getStringExtra("GENDER")
        val address = intent.getStringExtra("ADDRESS")

        tvName.text = "Name: $name"
        tvEmail.text = "Email: $email"
        tvAge.text = "Age: $age"
        tvGender.text = "Gender: $gender"
        tvAddress.text = "Address: $address"
    }
}
