import scala.collection.convert.ImplicitConversions.`collection asJava`

object Task2 {
  class ToDoItem(taskName:String, date: String){
    var done: Boolean = false

    override def toString = s"$taskName - till $date| DONE:$done"
    def TaskChangeToDone():Unit =  this.done = true
  }


  class ToDoList {

    var listOfTasks: List[ToDoItem] = List()

    def +(that: ToDoItem):Unit = {
      this.listOfTasks = this.listOfTasks :+ that
    }

    override def toString: String = {
      var s:String = ""
      this.listOfTasks.foreach(item => s = s + s"$item\n")
      s
    }

    def markAsDone(index: Int):Unit = {
      this.listOfTasks(index).TaskChangeToDone()
    }
    def removeAllDoneItems() = {
        this.listOfTasks = this.listOfTasks.filterNot(_.done)
    }

  }

    def main(arg: Array[String]): Unit = {
      val toDoList = new ToDoList()

      toDoList + new ToDoItem("Clean carpet", "2020-11-01")
      toDoList + new ToDoItem("Wash dishes", "2020-11-02")
      toDoList + new ToDoItem("Learn Scala and be professional with it", "2020-10-28")
      println(toDoList)
      toDoList.markAsDone(0)
      toDoList.removeAllDoneItems()
      println(toDoList)

    }

  }