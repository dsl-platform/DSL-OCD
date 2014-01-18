package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableXmls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableXmls: Set[Option[scala.xml.Elem]],
    private var _calculatedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]],
    private var _persistedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableXmls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableXmls_3("+ URI +")"

   def copy(oneSetOfNullableXmls: Set[Option[scala.xml.Elem]] = this._oneSetOfNullableXmls): OneSetOfNullableXmls_3 = {

  require(oneSetOfNullableXmls ne null, "Null value was provided for property \"oneSetOfNullableXmls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableXmls)
    new OneSetOfNullableXmls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableXmls = oneSetOfNullableXmls, _calculatedOneSetOfNullableXmls = _calculatedOneSetOfNullableXmls, _persistedOneSetOfNullableXmls = _persistedOneSetOfNullableXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableXmls_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableXmls = result._oneSetOfNullableXmls
    this._calculatedOneSetOfNullableXmls = result._calculatedOneSetOfNullableXmls
    this._persistedOneSetOfNullableXmls = result._persistedOneSetOfNullableXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableXmls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableXmls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableXmls = {
    _oneSetOfNullableXmls
  }

  def oneSetOfNullableXmls_= (value: Set[Option[scala.xml.Elem]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableXmls")
  def calculatedOneSetOfNullableXmls = {
    _calculatedOneSetOfNullableXmls
  }

  def calculatedOneSetOfNullableXmls_= (value: Set[Option[scala.xml.Elem]]) {
    _calculatedOneSetOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableXmls")
  def persistedOneSetOfNullableXmls = {
    _persistedOneSetOfNullableXmls
  }

  def persistedOneSetOfNullableXmls_= (value: Set[Option[scala.xml.Elem]]) {
    _persistedOneSetOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableXmls") oneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableXmls") calculatedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableXmls") persistedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableXmls = if (oneSetOfNullableXmls == null) Set.empty else oneSetOfNullableXmls, _calculatedOneSetOfNullableXmls = calculatedOneSetOfNullableXmls, _persistedOneSetOfNullableXmls = persistedOneSetOfNullableXmls)

}

object OneSetOfNullableXmls_3 extends AggregateRootCompanion[OneSetOfNullableXmls_3]{

  def apply(
    oneSetOfNullableXmls: Set[Option[scala.xml.Elem]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableXmls)
    require(oneSetOfNullableXmls ne null, "Null value was provided for property \"oneSetOfNullableXmls\"")
    new OneSetOfNullableXmls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableXmls = oneSetOfNullableXmls
    , _calculatedOneSetOfNullableXmls = Set.empty
    , _persistedOneSetOfNullableXmls = Set.empty)
  }

}
