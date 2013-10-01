package com.dslplatform.ocd

trait JavaImplStub
    extends JavaBoxImplStub
    with TipeConstrainnessType
    with TipeStablenessType
    with TipeComplexityType

trait JavaImplNullableStub
    extends JavaImplStub
    with JavaBoxImplNullableStub

// ------------------------------------

trait JavaOneImpl
    extends JavaImplStub
    with JavaBoxOneImpl

trait JavaOptImpl
    extends JavaImplNullableStub
    with JavaBoxOptImpl

trait JavaArrImpl
    extends JavaImplStub
    with JavaBoxArrImpl

trait JavaListImpl
    extends JavaImplStub
    with JavaBoxListImpl

trait JavaSetImpl
    extends JavaImplStub
    with JavaBoxSetImpl

trait JavaOptArrImpl
    extends JavaImplNullableStub
    with JavaBoxOptArrImpl

trait JavaOptListImpl
    extends JavaImplNullableStub
    with JavaBoxOptListImpl

trait JavaOptSetImpl
    extends JavaImplNullableStub
    with JavaBoxOptSetImpl

trait JavaArrOptImpl
    extends JavaImplStub
    with JavaBoxArrOptImpl

trait JavaListOptImpl
    extends JavaImplStub
    with JavaBoxListOptImpl

trait JavaSetOptImpl
    extends JavaImplStub
    with JavaBoxSetOptImpl

trait JavaOptArrOptImpl
    extends JavaImplNullableStub
    with JavaBoxOptArrOptImpl

trait JavaOptListOptImpl
    extends JavaImplNullableStub
    with JavaBoxOptListOptImpl

trait JavaOptSetOptImpl
    extends JavaImplNullableStub
    with JavaBoxOptSetOptImpl
