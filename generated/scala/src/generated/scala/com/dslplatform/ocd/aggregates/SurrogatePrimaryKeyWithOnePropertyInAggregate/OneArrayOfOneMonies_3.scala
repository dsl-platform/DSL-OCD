package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneMonies: Array[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneMonies_3("+ URI +")"

   def copy(oneArrayOfOneMonies: Array[BigDecimal] = this._oneArrayOfOneMonies): OneArrayOfOneMonies_3 = {

  require(oneArrayOfOneMonies ne null, "Null value was provided for property \"oneArrayOfOneMonies\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMonies)
    new OneArrayOfOneMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneMonies = oneArrayOfOneMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneMonies_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneMonies = result._oneArrayOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneMonies = {
    _oneArrayOfOneMonies
  }

  def oneArrayOfOneMonies_= (value: Array[BigDecimal]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneMonies = value

    _oneArrayOfOneMonies = com.dslplatform.api.Guards.setArrayScale(_oneArrayOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMonies") oneArrayOfOneMonies: Array[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneMonies = if (oneArrayOfOneMonies == null) Array.empty else oneArrayOfOneMonies)

}

object OneArrayOfOneMonies_3 extends AggregateRootCompanion[OneArrayOfOneMonies_3]{

  def apply(
    oneArrayOfOneMonies: Array[BigDecimal] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMonies)
    require(oneArrayOfOneMonies ne null, "Null value was provided for property \"oneArrayOfOneMonies\"")
    new OneArrayOfOneMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneMonies = oneArrayOfOneMonies)
  }

}
