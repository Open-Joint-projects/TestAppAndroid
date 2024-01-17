import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrv.R

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private val data = mutableListOf<String>() // Ваш список данных

    // Добавить метод для вставки новых данных в адаптер
    fun addData(item: String) {
        data.add(item)
        notifyDataSetChanged() // Обновить RecyclerView
    }

    // Создаем новые views (вызывается layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Создаем новый view
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_layout, viewGroup, false)
        return ViewHolder(view)
    }

    // Заменяет контент отдельного view (вызывается layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Получаем элемент из вашего DataSet по этой позиции
        // и заменяем контент view через viewHolder
        viewHolder.textView.text = data[position]
    }

    // Возвращает размер вашего DataSet (вызывается layout manager)
    override fun getItemCount(): Int {
        return data.size
    }

    // Предоставляет ссылку на представления для каждого элемента
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
    }
}
