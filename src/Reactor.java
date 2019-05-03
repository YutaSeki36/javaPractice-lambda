
public class Reactor {
    public static void main(String[] args) throws Exception {
//        System.out.println("hello world");
//        Flowable<String> flowable =
//                Flowable.create(emitter -> {
//                    String[] datas = {"Hello world", "こんにちは世界"};
//
//                    for (String data : datas) {
//                        if (emitter.isCancelled()) return;
//
//                        emitter.onNext(data);
//                    }
//
//                    emitter.onComplete();
//                }, BackpressureStrategy.BUFFER);
//
//        flowable
//                .observeOn(Schedulers.computation())
//                .subscribe(new Flow.Subscriber<String>() {
//
//                    private Flow.Subscription subscription;
//
//                    public void onSubscribe(Flow.Subscription subscription) {
//                        this.subscription = subscription;
//                        this.subscription.request(1);
//                    }
//
//                    public void onNext(String data) {
//                        String threadName = Thread.currentThread().getName();
//                        System.out.println(threadName + ":" + data);
//                        this.subscription.request(1);
//                    }
//
//                    public void onError(Throwable throwable) {
//                        throwable.printStackTrace();
//                    }
//
//                    public void onComplete() {
//                        String threadName = Thread.currentThread().getName();
//                        System.out.println(threadName + ":完了しました");
//
//                    }
//                });
//        Thread.sleep(500L);
    }
}