package screen

class ShoppingCategory {
    fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category);
        }

        println("=> 장바구니로 가려면 #을 입력 하세요")
        var selectedCategory = readln()
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readln()
        }
        if (selectedCategory == "#") {
        } else {
            if(categories.contains(selectedCategory))
            {
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory)
            }
            else
            {
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String) {
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다. 다시 입력해 주세요")
        showCategories()
    }
}