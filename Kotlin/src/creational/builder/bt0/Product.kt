package creational.builder.bt0

data class Product(val featureA : String,
                   val featureB : String,
                   val featureC : String) {

    class Builder {
        companion object {
            private var featureA : String = ""
            private var featureB : String = ""
            private var featureC : String = ""

            fun builder() : Companion {
                return Companion
            }

            fun featureA (featureA: String) : Companion{
                this.featureA = featureA
                return Companion
            }

            fun featureB (featureB: String) : Companion{
                this.featureB = featureB
                return Companion
            }

            fun featureC (featureC: String) : Companion{
                this.featureC = featureC
                return Companion
            }

            fun build() : Product {
                return Product(featureA, featureB, featureC)
            }
        }
    }

    override fun toString(): String {
        return "Product(featureA='$featureA', featureB='$featureB', featureC='$featureC')"
    }
}