public class A {
	
	private B b = new B();
	private static B b2;

	public void x() {
		
		// directFields
		this.b = ...; // aload_0, |...|, putfield
		b2 = ...; // |...|, putstatic

		B b3 = new B();
		
		// indirectFields
		b3.c = ...; // aload.*, (getfield)*, |...|, putfield
		b3.c.d = ...
		b.c = ...; // aload_0, (getfield)+, |...|, putfield
		b.c.d = ...;
		b2.c = ...; // getstatic, (getfield)*, |...|, putfield
		b2.c.d = ...;
	}
}

public class B {						
	public C c = new C();																
	...										
}				

public class C {
	public D d = new D();
	...	
}

public class D {
	...
}