package creational.builder.bt

import creational.builder.Product

class ProductBuilder {
    companion object {
        var product = Product()

        fun featureA(a : String) : Companion {
            product.featureA = a
            return Companion
        }

        fun featureB(b : String) : Companion {
            product.featureB = b
            return Companion
        }

        fun featureC(c : String) : Companion {
            product.featureC = c
            return Companion
        }

        fun build() : Product {
            return product
        }
    }
}