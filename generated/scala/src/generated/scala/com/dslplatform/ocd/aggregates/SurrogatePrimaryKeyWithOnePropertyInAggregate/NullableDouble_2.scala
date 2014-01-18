package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableDouble_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableDouble: Option[Double]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableDouble_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableDouble_2("+ URI +")"

   def copy(nullableDouble: Option[Double] = this._nullableDouble): NullableDouble_2 = {

  require(nullableDouble ne null, "Null value was provided for property \"nullableDouble\"")
    new NullableDouble_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableDouble = nullableDouble)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableDouble_2): this.type = {
    this._URI = result._URI
    this._nullableDouble = result._nullableDouble
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableDouble_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableDouble")
  def nullableDouble = {
    _nullableDouble
  }

  def nullableDouble_= (value: Option[Double]) {
    _nullableDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDouble") nullableDouble: Option[Double]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableDouble = nullableDouble)

}

object NullableDouble_2 extends AggregateRootCompanion[NullableDouble_2]{

  def apply(
    nullableDouble: Option[Double] = None
  ) = {
    require(nullableDouble ne null, "Null value was provided for property \"nullableDouble\"")
    new NullableDouble_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableDouble = nullableDouble)
  }

}
