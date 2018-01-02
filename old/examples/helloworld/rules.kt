package old.examples.helloworld

data class KotlinLibraryRule(
	val name: String,
	val jars: List<String> = listOf<String>(),
	val deps: List<String> = listOf<String>()
)

data class KotlinBinaryRule(
	val name: String,
	val jars: List<String> = listOf<String>(),
	val deps: List<String> = listOf<String>()
)
