package e

import a.A
import b.B
import c.C
import com.google.gson.Gson

class E {
  companion object {
	@JvmStatic
	fun main(args: Array<String>) {
	  E()
	}
  }

  init {
	Gson()
	A()
	B()
	C()
	D()
	println(this::class.simpleName)
  }
}