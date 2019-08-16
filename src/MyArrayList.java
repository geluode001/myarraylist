public class MyArrayList {
    //一个Object数组
    private Object[] objects;
    private  int size = 0;

    //初始容量为10
    public MyArrayList(){
        this(10);
    }

    public MyArrayList(int initCapacity) {
        if(initCapacity < 0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        objects = new Object[initCapacity];
    }

    public int length(){
        return size;
    }

    //add方法
//    public void add(Object object){
//        //判断索引是否大于容器容量,如果大于就扩容
//        if(size >= objects.length){
//            //size>>1 右移运算符
//            //原来长度的一半加上原长度也就是每次扩容原来的1.5倍
//            Object[] newObjects = new Object[size+(size >> 1)];
//            //使用底层拷贝,将原数组的内容拷贝到新数组
//            System.arraycopy(objects,0,newObjects,0,objects.length);
//            //将新数组赋值给原数组
//            objects = newObjects;
//        }
//        objects[size] = object;
//        size++;
//    }

    //get方法
    public Object get(int index){
        return objects[index];
    }

    //remove方法
    public Object remove(int index){
        Object obj = objects[index];
        //从删除元素的后一个位置开始赋值,复制 numIndex 个
        int numIndex = size-1-index;
        System.arraycopy(objects,index+1,objects,index,numIndex);
        //复制完后,长度要 -1 ,并指定最后一个位置的元素为null
        objects[--size] = null;
        return obj;
    }

    public void add(int index,Object object){
        if(size >= objects.length){
            Object[] newObjects = new Object[size+(size >> 1)];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        System.arraycopy(objects,index,objects,index+1,size-index);
        objects[index] = object;
        size++;
    }


}
