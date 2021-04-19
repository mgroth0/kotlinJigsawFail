package g

import a.A
import b.B
import c.C
import com.google.gson.Gson

class G {
  companion object {
	@JvmStatic
	fun main(args: Array<String>) {
	  G()
	}
  }

  init {
	Gson()
	A()
	B()
	C()
	E()
	F()
	println(this::class.simpleName)
  }
}