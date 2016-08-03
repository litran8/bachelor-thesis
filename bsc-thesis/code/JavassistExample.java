1 ClassPool pool = ClassPool.getDefault();
2 CtClass cc = pool.get("test.Rectangle");
3 cc.setSuperclass(pool.get("test.Point"));
4 cc.writeFile();