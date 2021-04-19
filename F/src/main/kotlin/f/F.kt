package f

import a.A
import b.B
import c.C
import com.google.gson.Gson

class F {
  companion object {
	@JvmStatic
	fun main(args: Array<String>) {
	  F()
	}
  }

  init {
	Gson()
	A()
	B()
	C()
	D()
	E()
	println(this::class.simpleName)
  }
}