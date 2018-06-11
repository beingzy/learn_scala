class Point(var x: Int = 0, var y: Int = 0) {

    def move(dx: Int, dy: Int): Unit = {
        x = x + dx
        y = y + dy
    }

    override def toString: String = 
        s"($x, $y)"
}


class NewPoint {
	private var _x = 0
	private var _y = 0
	private val bound = 100

	def x = _x
	def x_ = (newValue: Int): Int = {
		if (newValue < bound) _x = newValue else printWarning
	}

	def y = _y
	def y_ = (newValue: Int): Int = {
		if (newValue < bound) _y = newValue else printWarning 
	}
}


trait Iterator[A] {
	def hasNext: Boolean
	def next(): A
}


trait IntIterator(to: Int) extends Iterator[Int] {
	private var current = 0
	
	override def hasNext: Boolean = current < to 

	override def next(): Int = {
		if (hasNext) {
			val t = current 
			current += 1
			t
		} else 0
	}
}
