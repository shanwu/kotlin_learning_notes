package ex.pkg
import java.io.File

fun main(args: Array<String>) {
    if(args.size == 0) {
        println("Please enter txt file name w/ path, ex: ex/pkg/print_file_content.kt")
        return
    }
    val path = args.get(0)
    val file = File(path)

    if(args.size > 1) {
        val secondParam = args.get(1);
        if("-p".equals(secondParam)) {
            printFileContent(file)
        } else if ("-c".equals(secondParam)) {
            val lineCount = countFileLines(file)
            val message = "There are $lineCount lines in the file"
            println(message)
        }
    } else {
        printFileContent(file)
    }
}

fun printFileContent(file:File) = file.forEachLine {println(it) }

fun countFileLines(file:File):Int {
    var res = 0;
    file.forEachLine {
        res++;
    }
    return res;
}
