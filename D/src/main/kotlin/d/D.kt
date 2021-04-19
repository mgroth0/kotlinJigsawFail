package d

import a.A
import b.B
import c.C
import com.google.gson.Gson

class D {
  companion object {
	@JvmStatic
	fun main(args: Array<String>) {
	  D()
	}
  }

  init {
	Gson()
	A()
	B()
	C()
	println(this::class.simpleName)
  }
}