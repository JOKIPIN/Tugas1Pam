import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val age = etAge.text.toString().toIntOrNull() ?: 0
            val gender = if (rbMale.isChecked) "Male" else "Female"
            val address = etAddress.text.toString()

            val intent = Intent(this, DisplayDataActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("AGE", age)
            intent.putExtra("GENDER", gender)
            intent.putExtra("ADDRESS", address)
            startActivity(intent)
        }
    }
}
