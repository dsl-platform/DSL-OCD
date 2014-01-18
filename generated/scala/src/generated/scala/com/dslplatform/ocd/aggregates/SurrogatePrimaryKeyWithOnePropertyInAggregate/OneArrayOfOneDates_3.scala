package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneDates_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneDates: Array[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneDates_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneDates_3("+ URI +")"

   def copy(oneArrayOfOneDates: Array[org.joda.time.LocalDate] = this._oneArrayOfOneDates): OneArrayOfOneDates_3 = {

  require(oneArrayOfOneDates ne null, "Null value was provided for property \"oneArrayOfOneDates\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDates)
    new OneArrayOfOneDates_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneDates = oneArrayOfOneDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneDates_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneDates = result._oneArrayOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneDates_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDates")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneDates = {
    _oneArrayOfOneDates
  }

  def oneArrayOfOneDates_= (value: Array[org.joda.time.LocalDate]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDates") oneArrayOfOneDates: Array[org.joda.time.LocalDate]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneDates = if (oneArrayOfOneDates == null) Array.empty else oneArrayOfOneDates)

}

object OneArrayOfOneDates_3 extends AggregateRootCompanion[OneArrayOfOneDates_3]{

  def apply(
    oneArrayOfOneDates: Array[org.joda.time.LocalDate] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDates)
    require(oneArrayOfOneDates ne null, "Null value was provided for property \"oneArrayOfOneDates\"")
    new OneArrayOfOneDates_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneDates = oneArrayOfOneDates)
  }

}
