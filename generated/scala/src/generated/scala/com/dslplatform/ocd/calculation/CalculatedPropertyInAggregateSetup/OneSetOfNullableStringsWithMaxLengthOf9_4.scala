package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableStringsWithMaxLengthOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]],
    private var _calculatedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]],
    private var _persistedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableStringsWithMaxLengthOf9_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableStringsWithMaxLengthOf9_4("+ URI +")"

   def copy(oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]] = this._oneSetOfNullableStringsWithMaxLengthOf9): OneSetOfNullableStringsWithMaxLengthOf9_4 = {

  require(oneSetOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfNullableStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkCollectionOptionLength(oneSetOfNullableStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStringsWithMaxLengthOf9)
    new OneSetOfNullableStringsWithMaxLengthOf9_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableStringsWithMaxLengthOf9 = oneSetOfNullableStringsWithMaxLengthOf9, _calculatedOneSetOfNullableStringsWithMaxLengthOf9 = _calculatedOneSetOfNullableStringsWithMaxLengthOf9, _persistedOneSetOfNullableStringsWithMaxLengthOf9 = _persistedOneSetOfNullableStringsWithMaxLengthOf9)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableStringsWithMaxLengthOf9_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableStringsWithMaxLengthOf9 = result._oneSetOfNullableStringsWithMaxLengthOf9
    this._calculatedOneSetOfNullableStringsWithMaxLengthOf9 = result._calculatedOneSetOfNullableStringsWithMaxLengthOf9
    this._persistedOneSetOfNullableStringsWithMaxLengthOf9 = result._persistedOneSetOfNullableStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableStringsWithMaxLengthOf9_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableStringsWithMaxLengthOf9 = {
    _oneSetOfNullableStringsWithMaxLengthOf9
  }

  def oneSetOfNullableStringsWithMaxLengthOf9_= (value: Set[Option[String]]) {
    com.dslplatform.api.Guards.checkCollectionOptionLength(value, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableStringsWithMaxLengthOf9")
  def calculatedOneSetOfNullableStringsWithMaxLengthOf9 = {
    _calculatedOneSetOfNullableStringsWithMaxLengthOf9
  }

  def calculatedOneSetOfNullableStringsWithMaxLengthOf9_= (value: Set[Option[String]]) {
    _calculatedOneSetOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableStringsWithMaxLengthOf9")
  def persistedOneSetOfNullableStringsWithMaxLengthOf9 = {
    _persistedOneSetOfNullableStringsWithMaxLengthOf9
  }

  def persistedOneSetOfNullableStringsWithMaxLengthOf9_= (value: Set[Option[String]]) {
    _persistedOneSetOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableStringsWithMaxLengthOf9") oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableStringsWithMaxLengthOf9") calculatedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableStringsWithMaxLengthOf9") persistedOneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableStringsWithMaxLengthOf9 = if (oneSetOfNullableStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfNullableStringsWithMaxLengthOf9, _calculatedOneSetOfNullableStringsWithMaxLengthOf9 = calculatedOneSetOfNullableStringsWithMaxLengthOf9, _persistedOneSetOfNullableStringsWithMaxLengthOf9 = persistedOneSetOfNullableStringsWithMaxLengthOf9)

}

object OneSetOfNullableStringsWithMaxLengthOf9_4 extends AggregateRootCompanion[OneSetOfNullableStringsWithMaxLengthOf9_4]{

  def apply(
    oneSetOfNullableStringsWithMaxLengthOf9: Set[Option[String]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionLength(oneSetOfNullableStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableStringsWithMaxLengthOf9)
    require(oneSetOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfNullableStringsWithMaxLengthOf9\"")
    new OneSetOfNullableStringsWithMaxLengthOf9_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableStringsWithMaxLengthOf9 = oneSetOfNullableStringsWithMaxLengthOf9
    , _calculatedOneSetOfNullableStringsWithMaxLengthOf9 = Set.empty
    , _persistedOneSetOfNullableStringsWithMaxLengthOf9 = Set.empty)
  }

}
