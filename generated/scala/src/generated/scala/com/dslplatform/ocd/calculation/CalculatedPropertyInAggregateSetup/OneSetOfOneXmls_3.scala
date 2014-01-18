package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneXmls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneXmls: Set[scala.xml.Elem],
    private var _calculatedOneSetOfOneXmls: Set[scala.xml.Elem],
    private var _persistedOneSetOfOneXmls: Set[scala.xml.Elem]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneXmls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneXmls_3("+ URI +")"

   def copy(oneSetOfOneXmls: Set[scala.xml.Elem] = this._oneSetOfOneXmls): OneSetOfOneXmls_3 = {

  require(oneSetOfOneXmls ne null, "Null value was provided for property \"oneSetOfOneXmls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneXmls)
    new OneSetOfOneXmls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneXmls = oneSetOfOneXmls, _calculatedOneSetOfOneXmls = _calculatedOneSetOfOneXmls, _persistedOneSetOfOneXmls = _persistedOneSetOfOneXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneXmls_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneXmls = result._oneSetOfOneXmls
    this._calculatedOneSetOfOneXmls = result._calculatedOneSetOfOneXmls
    this._persistedOneSetOfOneXmls = result._persistedOneSetOfOneXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneXmls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneXmls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneXmls = {
    _oneSetOfOneXmls
  }

  def oneSetOfOneXmls_= (value: Set[scala.xml.Elem]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneXmls")
  def calculatedOneSetOfOneXmls = {
    _calculatedOneSetOfOneXmls
  }

  def calculatedOneSetOfOneXmls_= (value: Set[scala.xml.Elem]) {
    _calculatedOneSetOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneXmls")
  def persistedOneSetOfOneXmls = {
    _persistedOneSetOfOneXmls
  }

  def persistedOneSetOfOneXmls_= (value: Set[scala.xml.Elem]) {
    _persistedOneSetOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneXmls") oneSetOfOneXmls: Set[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneXmls") calculatedOneSetOfOneXmls: Set[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneXmls") persistedOneSetOfOneXmls: Set[scala.xml.Elem]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneXmls = if (oneSetOfOneXmls == null) Set.empty else oneSetOfOneXmls, _calculatedOneSetOfOneXmls = calculatedOneSetOfOneXmls, _persistedOneSetOfOneXmls = persistedOneSetOfOneXmls)

}

object OneSetOfOneXmls_3 extends AggregateRootCompanion[OneSetOfOneXmls_3]{

  def apply(
    oneSetOfOneXmls: Set[scala.xml.Elem] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneXmls)
    require(oneSetOfOneXmls ne null, "Null value was provided for property \"oneSetOfOneXmls\"")
    new OneSetOfOneXmls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneXmls = oneSetOfOneXmls
    , _calculatedOneSetOfOneXmls = Set.empty
    , _persistedOneSetOfOneXmls = Set.empty)
  }

}
