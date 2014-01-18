package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableStringsWithMaxLengthOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableStringsWithMaxLengthOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableStringsWithMaxLengthOf9_3("+ URI +")"

   def copy(oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]] = this._oneListOfNullableStringsWithMaxLengthOf9): OneListOfNullableStringsWithMaxLengthOf9_3 = {

  require(oneListOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfNullableStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkCollectionOptionLength(oneListOfNullableStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStringsWithMaxLengthOf9)
    new OneListOfNullableStringsWithMaxLengthOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableStringsWithMaxLengthOf9 = oneListOfNullableStringsWithMaxLengthOf9)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfNullableStringsWithMaxLengthOf9_3): this.type = {
    this._URI = result._URI
    this._oneListOfNullableStringsWithMaxLengthOf9 = result._oneListOfNullableStringsWithMaxLengthOf9
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfNullableStringsWithMaxLengthOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfNullableStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableStringsWithMaxLengthOf9 = {
    _oneListOfNullableStringsWithMaxLengthOf9
  }

  def oneListOfNullableStringsWithMaxLengthOf9_= (value: IndexedSeq[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionLength(value, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStringsWithMaxLengthOf9") oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableStringsWithMaxLengthOf9 = if (oneListOfNullableStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfNullableStringsWithMaxLengthOf9)

}

object OneListOfNullableStringsWithMaxLengthOf9_3 extends AggregateRootCompanion[OneListOfNullableStringsWithMaxLengthOf9_3]{

  def apply(
    oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionLength(oneListOfNullableStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableStringsWithMaxLengthOf9)
    require(oneListOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfNullableStringsWithMaxLengthOf9\"")
    new OneListOfNullableStringsWithMaxLengthOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableStringsWithMaxLengthOf9 = oneListOfNullableStringsWithMaxLengthOf9)
  }

}
