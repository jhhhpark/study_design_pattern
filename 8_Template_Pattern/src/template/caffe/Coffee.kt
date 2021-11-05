package template.caffe

class Coffee: CaffeineBeverage() {
    override fun brew() {
        println("필터로 커피를 우려내는 중")
    }

    override fun addCondiments() {
        println("설탕과 커피를 추가하는 중")
    }
}