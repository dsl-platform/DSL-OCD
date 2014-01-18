package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneIntegers_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneIntegers: Set[Int]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneIntegers_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneIntegers_3("+ URI +")"

   def copy(oneSetOfOneIntegers: Set[Int] = this._oneSetOfOneIntegers): OneSetOfOneIntegers_3 = {

  require(oneSetOfOneIntegers ne null, "Null value was provided for property \"oneSetOfOneIntegers\"")
    new OneSetOfOneIntegers_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneIntegers = oneSetOfOneIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneIntegers_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneIntegers = result._oneSetOfOneIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneIntegers_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneIntegers = {
    _oneSetOfOneIntegers
  }

  def oneSetOfOneIntegers_= (value: Set[Int]) {
    _oneSetOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIntegers") oneSetOfOneIntegers: Set[Int]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneIntegers = if (oneSetOfOneIntegers == null) Set.empty else oneSetOfOneIntegers)

}

object OneSetOfOneIntegers_3 extends AggregateRootCompanion[OneSetOfOneIntegers_3]{

  def apply(
    oneSetOfOneIntegers: Set[Int] = Set.empty
  ) = {
    require(oneSetOfOneIntegers ne null, "Null value was provided for property \"oneSetOfOneIntegers\"")
    new OneSetOfOneIntegers_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneIntegers = oneSetOfOneIntegers)
  }

}
